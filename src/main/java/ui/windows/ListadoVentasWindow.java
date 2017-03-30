package ui.windows;

import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import model.Venta;
import ui.vm.VentasViewModel;

public class ListadoVentasWindow extends SimpleWindow<VentasViewModel> {

	public ListadoVentasWindow(WindowOwner parent) {//construye la ventana fijandole el padre
		super(parent, new VentasViewModel());	//y el objeto que sera el modelo de la ventana
	}

	@Override
	protected void addActions(Panel panelActions) {
		new Button(panelActions)
		.setCaption("Nueva venta")
		.onClick(()->this.nuevaVenta());
	}
	@Override
	protected void createFormPanel(Panel formPanel) {
		this.setTitle("Macowins - Ventas");
		
		Table<Venta> tableVentas = new Table<>(formPanel, Venta.class);
		tableVentas.setNumberVisibleRows(30).bindItemsToProperty("ventas");
		
		/*Column<Venta> columnaFecha = new Column<Venta>(tableVentas);
		columnaFecha.setTitle("Fecha");*/
		
		Column<Venta> columnaPrenda = new Column<Venta>(tableVentas);
		columnaPrenda.setTitle("Prenda").setFixedSize(1000).bindContentsToProperty("prenda");
		
		Column<Venta> columnaUnidades = new Column<Venta>(tableVentas);
		columnaUnidades.setTitle("Cantidad").setFixedSize(1000).bindContentsToProperty("unidades");
		
		tableVentas.setHeight(300); //no funcionan
		tableVentas.setWidth(600); 
	}

	public void nuevaVenta() {
		Dialog<?> dialog = new NuevaVentaWindow(this);
		dialog.open();
		dialog.onAccept(() -> {});
	}
	public void registrarVenta(Venta venta){
		this.getModelObject().registrarVenta(venta);
	}

	
}
