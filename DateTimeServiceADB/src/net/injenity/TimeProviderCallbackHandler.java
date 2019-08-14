
/**
 * TimeProviderCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */

    package net.injenity;

    /**
     *  TimeProviderCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class TimeProviderCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public TimeProviderCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public TimeProviderCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getDate method
            * override this method for handling normal response from getDate operation
            */
           public void receiveResultgetDate(
                    net.injenity.GetDateResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getDate operation
           */
            public void receiveErrorgetDate(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getCalendar method
            * override this method for handling normal response from getCalendar operation
            */
           public void receiveResultgetCalendar(
                    net.injenity.GetCalendarResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getCalendar operation
           */
            public void receiveErrorgetCalendar(java.lang.Exception e) {
            }
                


    }
    