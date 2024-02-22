/*
 * The IEEE hereby grants a general, royalty-free license to copy, distribute,
 * display and make derivative works from this material, for all purposes,
 * provided that any use of the material contains the following
 * attribution: "Reprinted with permission from IEEE 1516.1(TM)-202X".
 * Should you require additional information, contact the Manager, Standards
 * Intellectual Property, IEEE Standards Association (stds-ipr@ieee.org).
 */

//File: FederateHandleSaveStatusPair.java
package hla.rti1516_202X;

import java.io.Serializable;

/**
 * Array of these records returned by (4.17) federationSaveStatusResponse
 */

public final class FederateHandleSaveStatusPair
   implements Serializable {
   public FederateHandleSaveStatusPair(FederateHandle fh, SaveStatus ss)
   {
      handle = fh;
      status = ss;
   }

   public final FederateHandle handle;
   public final SaveStatus status;
}

//end FederateHandleSaveStatusPair
