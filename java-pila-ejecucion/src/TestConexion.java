
public class TestConexion {

	public static void main(String[] args) throws Exception {
		
		try(Conexion con = new Conexion()){
			con.leerDatos();
		} catch(IllegalStateException ex) {
			System.out.println("Ejecutando catch");
			ex.printStackTrace();
		}
		
		/*
		Conexion conexion = null;
		try {
			conexion = new Conexion();
			conexion.leerDatos();
		} catch (IllegalStateException ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("Ejecutando finally");
			if(conexion != null) {
				conexion.cerrar();
			}
		}*/
		
	}
	
}
