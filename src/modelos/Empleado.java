/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author hanss
 */
public class Empleado {
    private int Id;
    private String codigo;
    private String pwd;
    private String puestoEmpresa;

    public Empleado() {
    }

    public Empleado(int Id, String codigo, String pwd, String puestoEmpresa) {
        this.Id = Id;
        this.codigo = codigo;
        this.pwd = pwd;
        this.puestoEmpresa = puestoEmpresa;
    }

    @Override
    public String toString() {
        return "Empleado{" + "Id=" + Id + ", codigo=" + codigo + ", pwd=" + pwd + ", puestoEmpresa=" + puestoEmpresa + '}';
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPuestoEmpresa() {
        return puestoEmpresa;
    }

    public void setPuestoEmpresa(String puestoEmpresa) {
        this.puestoEmpresa = puestoEmpresa;
    }
    
    
}
