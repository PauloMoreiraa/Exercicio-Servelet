<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <form action="Calcular" method="POST">
        <input placeholder="Tamanho do conjunto (N)" type="text" name="N" />
        <input placeholder="Tamanho do conjunto (K)" type="text" name="K" />
        <input type="submit" value="Enviar" />
    </form>

    <!-- Verifica se há mensagens de erro definidas na requisição -->
    <% String erro = (String) request.getAttribute("erro");
       if (erro != null && !erro.isEmpty()) { %>
        <p style="color: red;"><%= erro %></p>
    <% } %>
    <p>abc</p>
</body>
</html>
