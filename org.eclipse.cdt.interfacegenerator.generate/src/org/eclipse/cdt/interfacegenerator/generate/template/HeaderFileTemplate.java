package org.eclipse.cdt.interfacegenerator.generate.template;

import java.util.*;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.*;
import org.eclipse.cdt.interfacegenerator.generate.*;

public class HeaderFileTemplate
{
  protected final String NL = System.getProperties().getProperty("line.separator");
  protected final String TEXT_1 = "#ifndef ";
  protected final String TEXT_2 = NL + "#define ";
  protected final String TEXT_3 = " 1" + NL;
  protected final String TEXT_4 = NL + "#endif // ";
  protected final String TEXT_5 = NL;

  public String generate(Object argument)
  {
    StringBuffer stringBuffer = new StringBuffer();
    Component component=(Component) argument;
    String includeProtection=component.getName().toUpperCase() + "_H";
    stringBuffer.append(TEXT_1);
    stringBuffer.append(includeProtection);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(includeProtection);
    stringBuffer.append(TEXT_3);
    for(Iterator interfaceIter=component.getAssignedInterfaces().iterator();interfaceIter.hasNext();){InterfaceTemplate template=new InterfaceTemplate();
    stringBuffer.append(NL);
    stringBuffer.append(template.generate(interfaceIter.next()));
    }
    stringBuffer.append(TEXT_4);
    stringBuffer.append(includeProtection);
    stringBuffer.append(TEXT_5);
    return stringBuffer.toString();
  }
}
