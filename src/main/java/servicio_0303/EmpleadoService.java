/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio_0303;

import java.util.List;
import modelo_0303.Empleado;

/**
 *
 * @author kevinandres
 */
public interface EmpleadoService {

    public void crear(Empleado empleado);

    public Empleado buscarPorCodigo(int codigo);

    public Empleado buscarPorNombre(String nombre);

    public List<Empleado> listar();

}
