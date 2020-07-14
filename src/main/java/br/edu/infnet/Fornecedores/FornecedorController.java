package br.edu.infnet.Fornecedores;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FornecedorController {
    
    @RequestMapping("/fornecedores/cadastrarFornecedor")
    public ModelAndView cadastrarFornecedor(@Valid Fornecedor fornecedor, BindingResult br){
        
        ModelAndView retorno = new ModelAndView("fornecedores/manter");
        
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
            FornecedorDAO dao = new FornecedorDAO();
            dao.inserir(fornecedor);
            retorno.addObject("sucesso", "Fornecedor " + fornecedor.getNomeFantasia()
                    + " gravado com sucesso.");
        }
        return retorno;
    }
}
