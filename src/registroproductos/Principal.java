/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registroproductos;

import Dao.TblProductos;
import formularios.FrmLogin;
import java.util.List;
import java.util.ArrayList;
import modelos.Productos;

/**
 *
 * @author hanss
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Productos> productos = new ArrayList();
        TblProductos tblproductos = new TblProductos(productos);
        
        FrmLogin frm = new FrmLogin();
        frm.setVisible(true);
    }
    
}
