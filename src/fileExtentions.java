import java.util.Arrays;

import uk.co.caprica.vlcj.filter.AudioFileFilter;
import uk.co.caprica.vlcj.filter.PlayListFileFilter;
import uk.co.caprica.vlcj.filter.SubTitleFileFilter;
import uk.co.caprica.vlcj.filter.VideoFileFilter;

public class fileExtentions {
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(AudioFileFilter.INSTANCE.getExtensions()));
		System.out.println(Arrays.toString(VideoFileFilter.INSTANCE.getExtensions()));
		System.out.println(Arrays.toString(PlayListFileFilter.INSTANCE.getExtensions()));
		System.out.println(Arrays.toString(SubTitleFileFilter.INSTANCE.getExtensions()));
	}

}
