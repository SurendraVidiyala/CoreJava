package com.puzzle.maze;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MazePuzzle {

	char[][] maze;
	int CRI;
	int CCI;
	int downMoves,upMoves,leftMoves,rightMoves;
	public MazePuzzle(String fileName)
	{
		try {
			FileInputStream in = new FileInputStream(fileName);
			    BufferedReader br = new BufferedReader(new InputStreamReader(in));
			    String line;
			    int row= Integer.parseInt(br.readLine());
			    int col = Integer.parseInt(br.readLine());
			    maze=new char[row][col];
			    int rowNum=0;
			    while((line = br.readLine()) != null)
			    {
			    	char[] rowChars = line.toCharArray();
			    	for(int colNum=0;colNum<rowChars.length;colNum++)
			    	{
			    		maze[rowNum][colNum]=rowChars[colNum];
			    		if(maze[rowNum][colNum] == 'S')
			    		{
			    			CRI=rowNum;
			    			CCI=colNum;
			    		}
			    	}
			    	rowNum++;
			    }
			    in.close();
		} catch (Exception e) {
			
		}
	}
	public static void main(String[] args) throws IOException {
		MazePuzzle obj = new MazePuzzle(System.getProperty("MazePuzzle.dir")+"\\com\\puzzle\\maze\\maze.txt");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String command="";
		String direction ;
		int noOfMove;
		//obj.readFile("maze.txt",4);
		boolean execute=true;
		while(execute)
		{
			System.out.println("Menu");
			System.out.println("1.Read Maze file\n2.Show the current maze map");
			System.out.println("3.Start The Game\n4.Exit");
			System.out.print("Select the number:");
			//String option = br.readLine();
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			int option=scanner.nextInt();
			switch(option)
			{
				case 1: System.out.println("Loading Maze");
						break;
				case 2: obj.displayMage();
						break;
				case 3: //obj.maze[obj.CRI][obj.CCI]='S';
						//obj.displayMage();
						System.out.print("Enter Command: ");
						command = br.readLine();
						if(command.length()<3)
						{
							System.out.println("please Enter valid command !");
							System.out.print("Enter Command: ");
							command = br.readLine();
						}
						direction=command.substring(0,command.indexOf(" "));
						noOfMove=Integer.parseInt((String) command.subSequence(command.indexOf(" ")+1, command.length()));
						//System.out.println(obj.maze[obj.CRI][obj.CCI]);
						if(obj.maze[obj.CRI][obj.CCI] == 'E'){
							System.out.println("Congratulation.");
						}else{
							obj.move(direction.charAt(0), noOfMove,obj);
							//obj.displayMage();
						}						
						break;
				case 4: System.out.println("bye");
						System.exit(0);
						break;
				default: System.out.println("invalid option");
						break;
			}
		}
		
	}
	public  void readFile(String fileName,Integer pointer) throws IOException
	{
		FileInputStream in = new FileInputStream(fileName);
	    BufferedReader br = new BufferedReader(new InputStreamReader(in));
	    String line;
	    int i=0;
	    while((line = br.readLine()) != null)
	    {
	    	if(pointer!=null)
	    	{
	    		System.out.println(line);
	    	}
	        
	    }
	    in.close();
	}
	public void displayMage()
	{
		for(int row=0;row<maze.length;row++)
		{
			for(int col=0;col<maze[row].length;col++)
			{
				System.out.print(maze[row][col]);
			}
			System.out.println();
		}
	}
	private void move(char direction,int noOfMoves,MazePuzzle obj)
	{
		boolean flag=true;
		switch(direction)
		{
			case 'U': flag=smartMove('U',noOfMoves,obj); 
						if(!flag) break;
						if(flag){CRI=CRI - noOfMoves;}
						break;
			case 'D': flag=smartMove('D',noOfMoves,obj); if(!flag) break;
						if(flag){CRI=CRI + noOfMoves;}
						break;
			case 'L':flag=smartMove('L',noOfMoves,obj); if(!flag) break;
						if(flag){CCI=CCI - noOfMoves;}
						break;
			case 'R': flag=smartMove('R',noOfMoves,obj); if(!flag) break;
						if(flag){CCI=CCI + noOfMoves;}
						break;
			default: System.out.println("Default");
						break;
		}
		if(maze[CRI][CCI]=='E'){
			System.out.println("*************** Congratulation ***************");
			System.out.println("Down Moves : "+obj.downMoves);
			System.out.println("Up Moves : "+obj.upMoves);
			System.out.println("Right Moves : "+obj.rightMoves);
			System.out.println("Left Moves : "+obj.leftMoves);
		}else{
			maze[CRI][CCI]= '.';
			obj.displayMage();
		}
	}
	public boolean smartMove(char direction,int noOfMoves,MazePuzzle obj)
	{
		boolean flag= true;
		int tempCRI=CRI;
		int tempCCI=CCI;
		for(int i=0;i<noOfMoves;i++)
		{
			switch(direction)
			{
				case 'U': tempCRI=tempCRI-1;
							if(maze[tempCRI][tempCCI]=='#')
							{
								System.out.println("invalid Move");
								flag=false;
							}else{
								obj.upMoves=obj.upMoves+noOfMoves;
							}
							break;
				case 'D': tempCRI=tempCRI+1;
							if(maze[tempCRI][tempCCI]=='#')
							{
								System.out.println("invalid Move");
								flag=false;
							}else{
								obj.downMoves=obj.downMoves+noOfMoves;
							}
							break;
				case 'L': tempCCI=tempCCI-1;							
					if(maze[tempCRI][tempCCI]=='#')
							{
								System.out.println("invalid Move");
								flag=false;
							}else{
								obj.leftMoves=obj.leftMoves+noOfMoves;
							}
							break;
				case 'R': tempCCI=tempCCI+1;						
					if(maze[tempCRI][tempCCI]=='#')
							{
								System.out.println("invalid Move");
								flag=false;
							}else{
								obj.rightMoves=obj.rightMoves+noOfMoves;
							}
							break;
				default: 
							break;
			}
		}
		
		return flag;
	}
	
}
