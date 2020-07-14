package br.edu.infnet.Contatos;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContatoController {
    
    @RequestMapping("/contatos/cadastrarContato")
    public ModelAndView cadastrarContato(@Valid Contato contatos, BindingResult br){
        
        ModelAndView retorno = new ModelAndView("contatos/manter");
        
        if(br.hasErrors()){
            
            //Converte o Binding em Arraylist para obter apenas as mensagens
            ArrayList<String> erros = new ArrayList<>();
            List<FieldError> listaErrosSpring = br.getFieldErrors();
            for (FieldError fieldError : listaErrosSpring) {
                
                erros.add(fieldError.getDefaultMessage());
            }
            
            //
            retorno.addObject("erros", erros);
        
        } else {
            
            //Grava no banco de dados usando um DAO
            ContatoDAO dao = new ContatoDAO();
            dao.inserir(contatos);
            retorno.addObject("sucesso", "Contato " + contatos.getNomeContato()
                    + " gravado com sucesso.");
        }
        return retorno;
    }
}
