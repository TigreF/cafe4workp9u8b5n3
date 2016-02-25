<%-- 
    Document   : EditarEstudiante
    Created on : 22/02/2016, 11:39:38 AM
    Author     : Tigre
--%>

<%@page import="java.util.Date"%>
<%@page import="DTO.EstudianteDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="estudiante" scope="page" class="DTO.EstudianteDTO" />  
        <jsp:useBean id="controlador" scope="page" class="Controller.Controller" />  
    <center>
        <h1>EDITAR DATOS DEL ESTUDIANTE</h1>



        <form name="registroEstudiante" action="../ModuloEstudiante/GuardarEstudianteEditado.jsp" method="POST">


            <%
                String documento, mostrar = "", variable = "";
                documento = request.getParameter("documento");
                mostrar = "Documento Identidad: <input type='text' name='documento' value='" + documento + "' />" + "<br>";

                estudiante.setIdentificacion(documento);
                estudiante = controlador.buscarEstudiante(estudiante);
                mostrar += estudiante.getIdentificacion();

                if (!estudiante.getPrimerNombre().equals(null)) {
                    variable = estudiante.getPrimerNombre();

                } else {
                    variable = "";
                }
                mostrar += "Primer Nombre:<font color='red'>*</font> <input type='text' name='primerNombre' value='" + variable + "' required />";

                if (estudiante.getSegundoNombre() != null) {
                    variable = estudiante.getSegundoNombre();

                } else {
                    variable = "";
                }
                mostrar += "Segundo Nombre: <input type='text' name='SegundoNombre' value='" + variable + "' /><br> />";

                if (!estudiante.getPrimerApellido().equals(null)) {
                    variable = estudiante.getPrimerApellido();

                } else {
                    variable = "";
                }

                mostrar += " Primer Apellido:<font color='red'>*</font> <input type='text' name='primerApellido' value='" + variable + "' required />";

                if (!estudiante.getSegundoApellido().equals(null)) {
                    variable = estudiante.getSegundoApellido();

                } else {
                    variable = "";
                }
                mostrar += " Segundo Apellido:<input type='text' name='segundoApellido' value='" + variable + "' /><br>";

                if (!estudiante.getDireccionResidencia().equals(null)) {
                    variable = estudiante.getDireccionResidencia();

                } else {
                    variable = "";
                }
                mostrar += "Dirección Residencia:<font color='red'>*</font><input type='text' name='direccionResidencia' value='" + variable + "' required=''/>";
                mostrar += "SEXO: <font color='red'>*</font> <select name='SEXO'>";
                if (estudiante.isSexo()) {
                    mostrar += "<option>-Seleccione-</option><option selected>MASCULINO</option><option>FEMENINO</option></select><br>";

                } else {
                    mostrar += "<option>-Seleccione-</option><option >MASCULINO</option><option selected>FEMENINO</option></select><br>";
                }

                if (!estudiante.getTelefonoCelular().equals(null)) {
                    variable = estudiante.getTelefonoCelular();

                } else {
                    variable = "";
                }

                mostrar += " Telefono Celular:<font color='red'>*</font><input type='text' name='telCelular' value='" + variable + "' />";

                if (!estudiante.getTelefonoFijo().equals(null)) {
                    variable = estudiante.getTelefonoFijo();

                } else {
                    variable = "";
                }

                mostrar += "Telefono Fijo: <input type='text' name='telFijo' value='" + variable + "' placeholder='5864123 ó 5865123'/><br>";

                if (!estudiante.getCorreoElectronico().equals(null)) {
                    variable = estudiante.getCorreoElectronico();

                } else {
                    variable = "";
                }

                mostrar += "  Correo Electronico: <input type='text' name='correoElectronico' value='" + variable + "' placeholder='ejemplo@ejemplo.com' />";

                if (estudiante.getFechaNacimiento()!=null) {
                    variable = estudiante.getFechaNacimiento().getYear() + estudiante.getFechaNacimiento().getMonth() + estudiante.getFechaNacimiento().getDate() + "";
    %>
            
            <%=mostrar+variable%>
            
            
    <%
                } else {
                    variable = "";
                }

                mostrar += "  Fecha Nacimiento: <input type='date' name='fechaNacimiento' value='" + variable + "'/>";

            %>

            <%=mostrar%>












            <br><br>

            <input type="submit" value="GUARDAR" />



        </form>
    </center>

</body>
</html>
