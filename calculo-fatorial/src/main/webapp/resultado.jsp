<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
     <h1>Resultados</h1>

             <h2>Permutações:</h2>
             <p>Número de permutações: <%= request.getAttribute("permutacoes") %></p>

             <h2>Combinações:</h2>
             <p>Número de combinações: <%= request.getAttribute("combinacoes") %></p>

</body>
</html>