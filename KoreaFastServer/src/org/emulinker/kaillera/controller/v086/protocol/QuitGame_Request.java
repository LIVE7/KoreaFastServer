package org.emulinker.kaillera.controller.v086.protocol;

import org.emulinker.kaillera.controller.messaging.MessageFormatException;

public class QuitGame_Request extends QuitGame
{
	public static final String	DESC	= "Quit Game Request";

	public QuitGame_Request(int messageNumber) throws MessageFormatException
	{
		super(messageNumber, "", 0xFFFF);
	}

	public String getDescription()
	{
		return DESC;
	}

	public String toString()
	{
		return getInfoString();
	}
}
