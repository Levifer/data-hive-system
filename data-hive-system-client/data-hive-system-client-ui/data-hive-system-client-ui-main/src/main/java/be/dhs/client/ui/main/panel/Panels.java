package be.dhs.client.ui.main.panel;

public enum Panels {
	MAINPANEL("MainPanel"),
	OTHERPANEL("OtherPanel");
	
	
	private String name;
	
	private Panels(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
