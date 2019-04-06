/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.gestores.tiquetes;

import logica.tiquetes.Tiquetes;

/**
 *
 * @author Dell
 */
public interface GestorTiquetes {
    
    public void crear(Tiquetes Tiquetes);
    public void eliminar(Tiquetes Tiquetes);
    public String consultar(Tiquetes Tiquetes);
    public void modificar(Tiquetes Tiquetes, Tiquetes TiqueteNuevo );
    
}
