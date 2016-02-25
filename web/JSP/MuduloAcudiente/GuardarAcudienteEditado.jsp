<%-- 
    Document   : GuardarAcudienteEditado
    Created on : 25/02/2016, 01:21:58 PM
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
        
        <jsp:useBean id="persona" scope="page" class="DTO.PersonaDTO" />  
        <jsp:useBean id="controlador" scope="page" class="Controller.Controller" />  
        <h1>guardar estudiante</h1>
         <%
             String fechaNacimiento,correoElectronico,telFijo,telCelular,sexo,direccionResidencia,primerApellido,SegundoApellido,documento,primerNombre,SegundoNombre, mostrar = "", variable = "";
                
             
                persona.setIdentificacion(request.getParameter("documento"));
            persona.setPrimerNombre(request.getParameter("primerNombre"));
                persona.setSegundoNombre(request.getParameter("SegundoNombre"));
                persona.setPrimerApellido(request.getParameter("primerApellido"));
                   persona.setSegundoApellido(request.getParameter("SegundoApellido"));
                   persona.setDireccionResidencia(request.getParameter("direccionResidencia"));
                    

//persona.setSexo(request.getParameter("sexo"));

                        persona.setTelefonoCelular(request.getParameter("telCelular"));
                      persona.setTelefonoFijo(request.getParameter("telFijo"));
                      persona.setCorreoElectronico(request.getParameter("correoElectronico"));
                      //  persona.setFechaNacimiento(request.getParameter("fechaNacimiento"));
                   
                  // controlador.guardarEstudianteEditado(estudiante);
                   
               
                
                %>
        
        
        
        <a href="../InicioPrincipal.jsp"></a>
   
    </body>
</html>
