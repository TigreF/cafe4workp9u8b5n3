<%-- 
    Document   : MatriculaEstudianteGrado
    Created on : 22/02/2016, 11:57:50 AM
    Author     : Tigre
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form action="../InicioPrincipal.jsp" method="POST">
      
        <h1>MATRICULAR AL ESTUDIANTE</h1>
       GRADO:  <select name="curso">
            <option>SE DEBE CARGAR</option>
            <option></option>
        </select>
        CURSO:  <select name="curso">
            <option>SE DEBE CARGAR</option>
            <option></option>
        </select><br>
        
        <input type="submit" value="MATRICULA" />
          </form>
    </body>
</html>
