<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sistema de Compras - Fornecedores</title>
    </head>
    <body>
        <h1>Sistema de Compras - Fornecedores</h1>
        <hr />
        <a href="index.jsp">Voltar</a>
        <form method="post" action="cadastrarFornecedor">
            <table>
                <tr>
                    <td>
                        Nome Fantasia :
                    </td>
                    <td>
                        <input type="text" name="nomeFantasia" />
                    </td>
                </tr>
                
                <tr>
                    <td>
                        Razão Social :
                    </td>
                    <td>
                        <input type="text" name="razaoSocial" />
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
