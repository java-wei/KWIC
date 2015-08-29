NAME
	KWIC - Key World In Context index System
	
DESCRIPTION
	KWIC (Key Word In Context) index system provides a search mechanism for information in a long list of lines, such as movie titles.  
	For each input title, it shall be ¡°circularly shifted¡± exhaustively by removing the first word and appending it at the end of the 
	line to create a set of circularly shifted lines unless the first word belong to the words to ignore.  The system will output on 
	the screen a listing of the circularly shifted lines for all input titles in ascending alphabetical order.
	
COMMAND
	The following command keywords are case insensitive.
	
	AT
		Add title strings to the list.  Different title are separated by comma.
		e.g. AT The Day after Tomorrow, Fast and Furious, Man of Steel
		
	AI
		Add words to ignore strings to the list.  Different words to ignore are separated by comma.
		e.g. AI is, the, of, and, as, a, after
		
	CT
		Clear all the titles in the list.
		
	CI
		Clear all the words to ignore in the list.
		
	EXIT
		Exit from the system

	SWITCH
		Switch to KWIC implementation under architecture 1 (Pipe and Filter).
	
	HELP
		Open this documentation.

	