<%@ page import="edu.umg.dao.NoticiasDAO" %>
<%@ page import="java.util.List" %>
<%@ page import="edu.umg.model.Noticias" %><%--
  Created by IntelliJ IDEA.
  User: crist
  Date: 26/10/2022
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
</head>
<body>

/**
Validación sobre parametros, usuario y contraseña, se ha colocado un usuario por defecto para el ingreso correspondiente
*/

<%
     String vUserName = request.getParameter("username");
     String vPassword = request.getParameter("password");

    /**
     * if que se utilizará como base para la validación de ingreso correspondiente a la aplicación
     */

    if(!    ( vUserName.equals("alejandro")&& vPassword.equals("1234"))){
        getServletConfig().getServletContext().getRequestDispatcher("/bienvenida.html").forward(request,response);

    }
%>

/**
*Encabezado sobre información de la aplicación, en donde se encuentra un nombre de los creadores de la aplicación
*/

<nav>
    <div class="nav-wrapper">
        <a href="#" class="brand-logo right">NOTICIAS EDWARD & ALEJANDRO</a>
        <ul id="nav-mobile" class="left hide-on-med-and-down">

            <li><a href="consultarBase.jsp" method="POST"  >Consultar en Base de Datos</a> </li>
        </ul>
    </div>
</nav>

/**
tabla sobre los datos, se muestra base de datos existente.
*/

<h1>Base de Datos</h1>
<table>


    <thead>
    <tr>
        <th>Correlativo</th>
        <th>Title</th>
        <th>Abstract</th>
        <th>Byline</th>
        <th>url</th>
    </tr>
    </thead>

    <tbody>

    <%--
    <%
       NoticiasDAO noticiasDAO = new NoticiasDAO();
       List<Noticias> noticiaa = noticiasDAO.getAllDB();

       for (Noticias noticia : noticiaa){
    %>
    <tr>
        <td><%=noticia.getCorrelativo()%>></td>
        <td><%=noticia.getTitle()%>></td>
        <td><%=noticia.getAbstracto()%>></td>
        <td><%=noticia.getByline()%>></td>
        <td><%=noticia.getUrl()%></td>
    </tr>
    <%
        }
    %>
--%>
    </tbody>
</table>
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</body>
</html>
