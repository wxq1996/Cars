package data;

public class MapData {
	public static final int LENGTH = 625;
	char map[][] = new char[LENGTH][LENGTH]; 
	public MapData() {
		for (int x = 0; x < LENGTH; ++x) {
			map[x][0] = 1;
			map[x][LENGTH - 1] = 1;
		}
		for (int y = 0; y < LENGTH; ++y) {
			map[0][y] = 1;
			map[LENGTH - 1][y] = 1;
		}
	}
}
