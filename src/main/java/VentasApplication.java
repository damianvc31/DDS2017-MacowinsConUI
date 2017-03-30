import org.uqbar.arena.Application;
import org.uqbar.arena.windows.Window;

import model.Fixture;
import ui.windows.ListadoVentasWindow;

public class VentasApplication extends Application{

	public static void main(String[] args) {
		Fixture.initialize(); //inicializa los repositorios de prendas
		new VentasApplication().start(); //inicia la aplicacion, dentro llama a createMainWindow 
								//y con lo que devuelve createMainWindow llama a createContents
	}
	
	@Override
	protected Window<?> createMainWindow() { //devuelve la ventana principal
		return new ListadoVentasWindow(this); //instanciada con this como parametro 
						//esto determina que la aplicacion es el "padre" de la ventana principal
	}
}
