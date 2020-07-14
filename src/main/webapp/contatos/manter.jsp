<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sistema de Compras - Contatos</title>
    </head>
    <body>
        <h1>Sistema de Compras - Contatos</h1>
        <hr />
        <a href="index.jsp">Voltar</a>
        <form method="post" action="cadastrarContato">
            <table>
                <tr>
                    <td>
                        Nome :
                    </td>
                    <td>
                        <input type="text" name="nomeContato" />
                    </td>
                </tr>
                
                <tr>
                    <td>
                        Email :
                    </td>
                    <td>
                        <input type="email" name="emailContato" placeholder="Contato@email.com.br"/>
                    </td>
                </tr>
                
                <tr>
                    <td>
                        Telefone :
                    </td>
                    <td>
                        <input type="tel" name="telefoneContato" placeholder="2133445566"/>
                    </td>
                </tr>
                
                <tr>
                    <td colspan="2" style="text-align: center">
                        <input type="submit" value="Cadastrar" />
                    </td>
                </tr>
            </table>
        </form>
        <div style="color: red">
            <c:forEach var="erro" items="${erros}">
                <h3>${erro}</h3>
            </c:forEach>
        </div>
        
        <div style="color: green">
            <c:forEach var="sucesso" items="${sucesso}">
                <h3>${sucesso}</h3>
            </c:forEach>
        </div>
            
    </body>
</html>
