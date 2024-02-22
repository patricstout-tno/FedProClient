/*
 * The IEEE hereby grants a general, royalty-free license to copy, distribute,
 * display and make derivative works from this material, for all purposes,
 * provided that any use of the material contains the following
 * attribution: "Reprinted with permission from IEEE 1516.1(TM)-202X".
 * Should you require additional information, contact the Manager, Standards
 * Intellectual Property, IEEE Standards Association (stds-ipr@ieee.org).
 */

package hla.rti1516_202X;

/**
 * Enum used to select callback model in connect.
 *
 * @see RTIambassador#connect
 */
public enum CallbackModel {
   HLA_IMMEDIATE,
   HLA_EVOKED
}
