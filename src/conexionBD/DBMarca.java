package conexionBD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.WriteResult;
import Firebase.conectFirebase;
import modelo.marca;
import views.ventanasAvisos;

public class DBMarca {
    
    private PreparedStatement pre;
    private ResultSet resu;
    private ventanasAvisos avisos;

    public DBMarca() {
		// TODO Auto-generated constructor stub
    	avisos = new ventanasAvisos(null);
	}
	
	public void registrarMarca(marca marca) {
		cargaFirestore(marca);
		
        try {
            pre= coneCone.connect().prepareStatement(instruccionesSQL.instruccionRegistrarMarca);
            pre.setString(1, marca.getNombreMarca());
            pre.setInt(2, marca.getCodBarMarca());
            pre.execute();
            pre.close();
            coneCone.connect().close();
            //avisos.cargaCorrecta(ventanasAvisos.CARGA_OK);     
            
        } catch (Exception e) {
        	System.out.print("No se pudo cargar" + e.getMessage());
        	avisos.cargaFallida(ventanasAvisos.CARGA_ERROR, e.getMessage());
        }
    }
	
	private void cargaFirestore(marca marca) {
    	
    	DocumentReference docRef = conectFirebase.getInstance().collection("marcas").document();

    	ApiFuture<WriteResult> result = docRef.create(marca);
    	
    	if(result.isDone()) {
    		avisos.cargaCorrecta(ventanasAvisos.CARGA_OK); 	
    	}
	}

	public boolean verificarCodigo(int codigo) {
		
		boolean estado = false;
		
		try {
			pre= coneCone.connect().prepareStatement(instruccionesSQL.instruccionVerificarCodigoMarca + codigo);
			resu= pre.executeQuery();
			
			while (resu.next()) {estado=true;}

			resu.close();
			pre.close();
			coneCone.connect().close();
			
		} catch (Exception e) {
			avisos.errorConsulta(ventanasAvisos.ERROR_CONSULTA, e.getMessage());
		}

		return estado;
	}

	public marca obtenerMarca(int codigo) {
		
		marca martemp = null;
		
		try {
			pre= coneCone.connect().prepareStatement(instruccionesSQL.instruccionObtenerObjetoMarca + codigo);
			resu= pre.executeQuery();
			
			while (resu.next()) {
				martemp = new marca();
				martemp.setCodBarMarca(resu.getInt("codMarca"));
				martemp.setIdMarca(resu.getInt("idMarca"));
				martemp.setNombreMarca(resu.getString("nombre"));
				
			pre.close();
			resu.close();
			coneCone.connect().close();
			}
			
		} catch (Exception e) {
			avisos.errorConsulta(ventanasAvisos.ERROR_CONSULTA, e.getMessage());
		}
		
		return martemp;
	}
}
