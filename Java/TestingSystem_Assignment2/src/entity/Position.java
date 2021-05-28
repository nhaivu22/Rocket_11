package entity;

public class Position {
	public byte id;
	public PositionName positionName;

	public enum PositionName {
		DEV, TEST, SCRCRUMMASTER, PM;
	}
}
