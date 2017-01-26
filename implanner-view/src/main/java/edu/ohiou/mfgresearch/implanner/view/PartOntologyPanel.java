package edu.ohiou.mfgresearch.implanner.view;

import edu.ohiou.mfgresearch.implanner.parts.*;
import jess.Rete;

public class PartOntologyPanel extends IntegrationPanel {

	public PartOntologyPanel() {
		// TODO Auto-generated constructor stub
	}

	public PartOntologyPanel(MfgPartModel model) {
		super(model);
		// TODO Auto-generated constructor stub
	}

	public PartOntologyPanel(Rete engine) {
		super(engine);
		// TODO Auto-generated constructor stub
	}
	
	{	buttonOptions = 0;
	buttonToolBar.removeAll();
//	addButtonOptions(OPEN_XML | SAVE_XML);// | GENERATE_TPN | GENERATE_AUGMENTED_FPN | SHOW_4_AXIS_SETUPS | SHOW_3_AXIS_SETUPS);
}
	
	public void configureButtons() {
		super.configureButtons();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PartOntologyPanel pop = new PartOntologyPanel();
		pop.display();
	}

}
