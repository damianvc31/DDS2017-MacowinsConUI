package ui.windows;

import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.NumericField;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.Selector;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

import model.Prenda;
import ui.vm.VentaViewModel;

public class NuevaVentaWindow extends Dialog<VentaViewModel> {

	public NuevaVentaWindow(WindowOwner owner) {
		super(owner, new VentaViewModel());
	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		this.setTitle("Nueva venta");
		
		Panel form = new Panel(mainPanel);
		form.setLayout(new ColumnLayout(2));

		new Label(form).setText("Prendas");
		Selector<Prenda> selectorPrenda = new Selector<Prenda>(form).allowNull(true);
		selectorPrenda.bindItemsToProperty("prendas");
		selectorPrenda.bindValueToProperty("prendaSeleccionada");

		new Label(form).setText("Prenda Seleccionada");
		new Label(form).bindValueToProperty("prendaSeleccionada");

		new Label(form).setText("Cantidad");
		new NumericField(form).setWidth(100).bindValueToProperty("unidades");
	}

	@Override
	protected void addActions(Panel actions) {
		new Button(actions).setCaption("Aceptar").onClick(this::accept).setAsDefault();
		new Button(actions).setCaption("Cancelar").onClick(this::cancel);
	}

	@Override
	protected void executeTask() {
		if (this.getModelObject().getUnidades() > 0
			&& this.getModelObject().getPrendaSeleccionada() != null) {
			((ListadoVentasWindow) this.getOwner())
					.registrarVenta(this.getModelObject().generarVenta()); 
			
		}
		super.executeTask();
	}

}
