/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Mysql;

import DAO.Interface.IPersonaDAO;
import DTO.EstudianteDTO;
import DTO.PersonaDTO;
import Factory.Concrete.MysqlDAOFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author renzo
 */
public class MysqlPersonaDAO implements IPersonaDAO {

    private Connection conex;

    public MysqlPersonaDAO() {
        conex = MysqlDAOFactory.createConnection();
    }

    @Override
    public PersonaDTO buscarPersona(PersonaDTO persona) throws Exception {

        PersonaDTO per = null;

        try {

            String selectStatement = "SELECT `persona`.`identificacion`,\n"
                    + "    `persona`.`nombre_pro`,\n"
                    + "    `persona`.`nombre_sdo`,\n"
                    + "    `persona`.`apellido_pro`,\n"
                    + "    `persona`.`apeliido_sdo`,\n"
                    + "    `persona`.`fecha_nacimiento`,\n"
                    + "    `persona`.`sexo`,\n"
                    + "    `persona`.`direccion`,\n"
                    + "    `persona`.`telefono1`,\n"
                    + "    `persona`.`telefono2`,\n"
                    + "    `persona`.`correo_electronico`\n"
                    + "FROM `sanmiguel`.`persona` WHERE identificacion=?";
            PreparedStatement prepStmt = conex.prepareStatement(selectStatement);
            prepStmt.setNString(1, persona.getIdentificacion());
            ResultSet rs = prepStmt.executeQuery();

            while (rs.next()) {

                per = new PersonaDTO();
                per.setIdentificacion(rs.getString(1));
                per.setPrimerNombre(rs.getString(2));
                per.setSegundoNombre(rs.getString(3));
                per.setPrimerApellido(rs.getString(4));
                per.setSegundoApellido(rs.getString(5));
                per.setFechaNacimiento(rs.getDate(6));
                int sexo = rs.getInt(7);
                if (sexo == 1) {
                    per.setSexo(true);
                } else {
                    per.setSexo(false);
                }
                per.setDireccionResidencia(rs.getString(8));
                per.setTelefonoCelular(rs.getString(9));
                per.setTelefonoFijo(rs.getString(10));
                per.setCorreoElectronico(rs.getString(11));

            }//while

            rs.close();

        } catch (Exception e) {
            per = null;
            // throw new Exception(e); //if exception -> puts the object employee to null and sends the exception
        } finally {
            if (conex != null) {
                conex.close();
            }
        }
        return (per);

    }

}
