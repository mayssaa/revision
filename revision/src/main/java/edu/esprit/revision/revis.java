package edu.esprit.revision;

public class revis {
	public revis(){
		
	}
	public int process(int n){
		if(n<2)
		{return 15;
		}
		else
		{
			return process(n-1)+process(n-2);
			
		}
	}

}
