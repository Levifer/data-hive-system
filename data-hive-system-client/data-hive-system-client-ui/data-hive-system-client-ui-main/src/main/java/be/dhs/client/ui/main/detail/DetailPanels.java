package be.dhs.client.ui.main.detail;

public enum DetailPanels {
	ArtistDetailPanel("ArtistDetailPanel"),
	AlbumDetailPanel("AlbumDetailPanel"),
	SongDetailPanel("SongDetailPanel");
	
	private String name;
	
	private DetailPanels(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
