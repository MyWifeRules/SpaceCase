
public class hyperChunkManager 
{

	/*this guy holds all the hyperchunks, indexes them into their proper locations, and can
	*pull the associated tessaracts.
	*
	*Right now it only holds one hyperchunk, for testing.
	*/
	
	hyperChunk hca = new hyperChunk();
	
	public hyperChunkManager(){
		hca.generateHyperChunk();
	}
	
	public tessaract[] getTessaracts(){
		return hca.getTesses();
	}
	
	
	
}
