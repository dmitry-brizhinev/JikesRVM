package com.ibm.JikesRVM.memoryManagers.JMTk;

import com.ibm.JikesRVM.VM_Address;
import com.ibm.JikesRVM.VM_PragmaInline;
import com.ibm.JikesRVM.VM_Uninterruptible;

//$Id:

/**
 * Callbacks from ScanObject to Plan.enumeratePointerLocation are
 * dispatched through an object of this class, so that we have the
 * opportunity to change the behaviour through sub-classing. <p>
 *
 * @author Robin Garner
 * @version $Revision$
 * @date    $Date$
 */

public class Enumerate implements VM_Uninterruptible {
  private Plan plan;

  /* Constructor 
   */

  Enumerate(Plan plan) { 
    this.plan = plan; 
  }

  public void enumeratePointerLocation(VM_Address location) 
      throws VM_PragmaInline {
    plan.enumeratePointerLocation(location);
  }
}
