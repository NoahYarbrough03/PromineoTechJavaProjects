
public class Week5Project {
	interface Logger {
	    void log(String message);
	    void error(String message);
	}
	class AsteriskLogger implements Logger {
	    @Override
	    public void log(String message) {
	        System.out.println("***" + message + "***");
	    }

	    @Override
	    public void error(String message) {
	        System.out.println("****************");
	        System.out.println("***Error: " + message + "***");
	        System.out.println("****************");
	    }
	    class SpacedLogger implements Logger {
	        @Override
	        public void log(String message) {
	            StringBuilder spacedMessage = new StringBuilder();
	            for (char c : message.toCharArray()) {
	                spacedMessage.append(c).append(' ');
	            }
	            System.out.println(spacedMessage.toString());
	        }

	        @Override
	        public void error(String message) {
	            StringBuilder spacedErrorMessage = new StringBuilder("ERROR: ");
	            for (char c : message.toCharArray()) {
	                spacedErrorMessage.append(c).append(' ');
	            }
	            System.out.println(spacedErrorMessage.toString());
	        }
	    }
	    public class App {
	        public static void main(String[] args) {
	            Logger asteriskLogger = new AsteriskLogger();
	            Logger spacedLogger = new SpacedLogger();

	            // Testing AsteriskLogger
	            asteriskLogger.log("Hello");
	            asteriskLogger.error("Hello");

	            // Testing SpacedLogger
	            spacedLogger.log("Hello");
	            spacedLogger.error("Hello");
	        }
	    }
	}
}
