<%-- 
    Document   : MatricularEstudiante
    Created on : 22/02/2016, 08:50:44 AM
    Author     : Tigre
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>  </body>

   <center>
        <h1>REGISTRO ESTUDIANTE</h1>
        
       
    
        <form name="registroEstudiante" action="../MuduloAcudiente/RegistroAcudiente.jsp" method="POST">
           
            
            <%
                String documento,mostrar="";
                documento=request.getParameter("documento");
                mostrar="Documento Identidad: <input type='text' name='documento' value='"+documento+"' />";
            %>
            
            <%=mostrar%><br>
            Primer Nombre:<font color="red">*</font> <input type="text" name="primerNombre" value="" required="" />
            Segundo Nombre: <input type="text" name="SegundoNombre" value="" /><br>
            Primer Apellido:<font color="red">*</font> <input type="text" name="primerApellido" value="" required="" />
            Segundo Apellido:<input type="text" name="segundoApellido" value="" /><br>
            Dirección Residencia:<font color="red">*</font><input type="text" name="direccionResidencia" value="" required=""/>
            SEXO: <font color="red">*</font> <select name="SEXO" required>
                <option>-Seleccione-</option>
                <option>MASCULINO</option>
                <option>FEMENINO</option>
            </select><br>
            Telefono Celular:<font color="red">*</font><input type="text" name="telCelular" value="" />
            Telefono Fijo: <input type="text" name="telFijo" value="" placeholder="5864123 ó 5865123"/><br>
            Correo Electronico: <input type="text" name="correoElectronico" value="" placeholder="ejemplo@ejemplo.com" />





            <br><br>

            <input type="submit" value="SIGUIENTE" />



        </form>
    </center>


</body>
</html>
