import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Poking_Lottery{
	public static void main(String[] args){
		List<String> emoji = new ArrayList<>();
		List<String> Special_Emoji = new ArrayList<>();
		
			try{
				Read_File("data.csv", emoji, Special_Emoji);
			} catch(IOException e){
				e.printStackTrace();
			}
			emoji.removeAll(Special_Emoji);
			
			String output = game(emoji, Special_Emoji);
			System.out.println(output);
	}

	private static String game(List<String> emoji, List<String> Special_Emoji){
		String result = "";
		int index = 7;
		int[] positionX = new int[Special_Emoji.size()];
		int[] positionY = new int[Special_Emoji.size()];
		for(int i = 0; i < Special_Emoji.size(); i++){
			// Math.random() * (MAX - 1 - min + 1) + min
			positionX[i] = (int)(Math.random() * (index - 1 - 0 + 1) + 0);
			positionY[i] = (int)(Math.random() * (index - 1 - 0 + 1) + 0);
		}
		for(int y = 0; y < index; y++){
			for(int x = 0; x < index; x++){
				int flag = -1;
				for(int i = 0; i < Special_Emoji.size(); i++){
					if (x == positionX[i] && y == positionY[i]){
						flag = i;
						break;
					}
				}
				// Special_Emoji.get(flag) is here
				if(flag > -1){
					result += Special_Emoji.get(flag);
				}
				else{
					result += emoji.get((int)(Math.random() * (emoji.size() - 1 - 0 + 1) + 0)  );
				}
			}
		}
		return result;
	}
	
	private static void Read_File(String file, List<String> emoji, List<String> Special_Emoji) throws IOException {
		String line = "";
		boolean firstLine = true;
		List<Integer> index = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			while ((line = br.readLine()) != null) {
				// It's the first line
				if (firstLine) {
					firstLine = false;
					continue;
				}
				else{
					String[] data = line.split(",");
					// No columns in the line
					if (data.length < 1) {
						continue;
					}
					// the line has Emoji and Special
					else if (data.length > 1) {
						index.add(Integer.parseInt(data[1].trim())  );
					}
					try{
						emoji.add(data[0].trim() + "#" );
					} catch (NumberFormatException e) {
						System.out.println("Invalid value: " + data[1].trim());
					} catch (StringIndexOutOfBoundsException e) {
						System.out.println("Index out of bounds for emoji");
					}
				}
			}
			for(int i : index){
				Special_Emoji.add(emoji.get(i - 1));
			}
		}
	}
}