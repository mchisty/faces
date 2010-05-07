/**
 * 
 */
package org.jboss.seam.faces.display;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;

/**
 * @author <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 * 
 */
public enum Level
{
   INFO(FacesMessage.SEVERITY_INFO), WARN(FacesMessage.SEVERITY_WARN), ERROR(FacesMessage.SEVERITY_ERROR), FATAL(FacesMessage.SEVERITY_FATAL);

   private Severity severity;

   Level(final Severity severity)
   {
      this.severity = severity;
   }

   public static Level valueOf(final Severity severity)
   {
      Level result = null;

      if (severity != null)
      {
         for (Level l : Level.values())
         {
            if (l.severity.equals(severity))
            {
               result = l;
            }
         }
      }
      return result;
   }

   public Severity getSeverity()
   {
      return severity;
   }
}