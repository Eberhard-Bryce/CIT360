package ACP;


import java.util.HashMap;

import ACP.Handle;

public class AppController {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	HashMap<String,Handle> handlerMap = new HashMap();

    public void handleRequest(String command){
        Handle aCommandHandler = handlerMap.get(command);
        if (aCommandHandler != null){
            aCommandHandler.Show();
        }
    }

    public void mapCommand(String aCommand, Handle aHandler){
        handlerMap.put(aCommand,aHandler);
    }
}
