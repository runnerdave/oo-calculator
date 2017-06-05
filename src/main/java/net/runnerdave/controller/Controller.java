package net.runnerdave.controller;

import net.runnerdave.model.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by David A. Jiménez (e67997) on 5/06/2017.
 */
public class Controller {
   public static Map<String, Operation> controllerMap = new HashMap<>();

   static {
      controllerMap.put("+", new Add());
      controllerMap.put("-", new Subtract());
      controllerMap.put("/", new Divide());
      controllerMap.put("*", new Multiply());
      controllerMap.put("sin", new Sine());
      controllerMap.put("cos", new Cosine());
   }


}
