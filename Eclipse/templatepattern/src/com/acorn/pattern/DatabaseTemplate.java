package com.acorn.pattern;

public abstract class DatabaseTemplate {
	public abstract void initialize();
	public abstract void startDatabase();
	public abstract void endDatabase();

	public final void useDatabase() {
		initialize();
		startDatabase();
		endDatabase();
	}
	
}
