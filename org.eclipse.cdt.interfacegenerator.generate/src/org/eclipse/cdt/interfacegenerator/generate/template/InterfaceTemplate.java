package org.eclipse.cdt.interfacegenerator.generate.template;

import java.util.*;
import org.eclipse.cdt.interfacegenerator.interfacegenerator.*;
import org.eclipse.cdt.interfacegenerator.generate.*;

public class InterfaceTemplate
{
  protected final String NL = System.getProperties().getProperty("line.separator");
  protected final String TEXT_1 = "   ";
  protected final String TEXT_2 = "namespace ";
  protected final String TEXT_3 = "{";
  protected final String TEXT_4 = NL + "class ";
  protected final String TEXT_5 = " : ";
  protected final String TEXT_6 = "public ";
  protected final String TEXT_7 = ", ";
  protected final String TEXT_8 = "{" + NL + "   public:" + NL + "      template <class T> struct ";
  protected final String TEXT_9 = "_functions;" + NL + "      template <class T> ";
  protected final String TEXT_10 = "(T& x): ";
  protected final String TEXT_11 = "(x)";
  protected final String TEXT_12 = ", ";
  protected final String TEXT_13 = "," + NL + "         myT(";
  protected final String TEXT_14 = "_functions<T>::table()){};";
  protected final String TEXT_15 = NL + "      ";
  protected final String TEXT_16 = "void";
  protected final String TEXT_17 = " ";
  protected final String TEXT_18 = "(";
  protected final String TEXT_19 = ", ";
  protected final String TEXT_20 = ")";
  protected final String TEXT_21 = " const";
  protected final String TEXT_22 = NL + "      {" + NL + "         ";
  protected final String TEXT_23 = "return ";
  protected final String TEXT_24 = "myT.";
  protected final String TEXT_25 = "(const_cast<void*>(myA)";
  protected final String TEXT_26 = ", ";
  protected final String TEXT_27 = ");" + NL + "      };";
  protected final String TEXT_28 = NL + NL + "      struct ";
  protected final String TEXT_29 = "_functionTableType" + NL + "      {";
  protected final String TEXT_30 = NL + "         ";
  protected final String TEXT_31 = "void";
  protected final String TEXT_32 = " (*";
  protected final String TEXT_33 = ") (void *";
  protected final String TEXT_34 = ", ";
  protected final String TEXT_35 = ");";
  protected final String TEXT_36 = NL + "      };" + NL + "      template <class T> struct ";
  protected final String TEXT_37 = "_functions" + NL + "      {" + NL + "         static struct ";
  protected final String TEXT_38 = "::";
  protected final String TEXT_39 = "_functionTableType &table()" + NL + "         {" + NL + "            static struct ";
  protected final String TEXT_40 = "::";
  protected final String TEXT_41 = "_functionTableType table=" + NL + "            {";
  protected final String TEXT_42 = NL + "               &";
  protected final String TEXT_43 = "::";
  protected final String TEXT_44 = "_functions<T>::";
  protected final String TEXT_45 = ",";
  protected final String TEXT_46 = NL + "            };" + NL + "            return table;" + NL + "         }" + NL + "      };" + NL + "   private:";
  protected final String TEXT_47 = NL + "      ";
  protected final String TEXT_48 = "_functionTableType const& myT;" + NL + "};";
  protected final String TEXT_49 = "   ";
  protected final String TEXT_50 = "} // ";
  protected final String TEXT_51 = NL;

  public String generate(Object argument)
  {
    StringBuffer stringBuffer = new StringBuffer();
    Interface theInterface=(Interface) argument;
    List baseClasses=Helper.getBaseClasses(theInterface);
    List namespace=Helper.getNamespace(theInterface);
    for (int i=0;i < namespace.size();i++){
    for (int j=0;j < i;j++){
    stringBuffer.append(TEXT_1);
    }
    stringBuffer.append(TEXT_2);
    stringBuffer.append(namespace.get(i));
    stringBuffer.append(TEXT_3);
    stringBuffer.append(NL);
    }
    stringBuffer.append(TEXT_4);
    stringBuffer.append(theInterface.getName());
    stringBuffer.append(TEXT_5);
    for (Iterator baseClassIter=baseClasses.iterator();baseClassIter.hasNext();){
    stringBuffer.append(TEXT_6);
    stringBuffer.append(baseClassIter.next());
    if (baseClassIter.hasNext()){
    stringBuffer.append(TEXT_7);
    }}
    stringBuffer.append(TEXT_8);
    stringBuffer.append(theInterface.getName());
    stringBuffer.append(TEXT_9);
    stringBuffer.append(theInterface.getName());
    stringBuffer.append(TEXT_10);
    for (Iterator baseClassIter=baseClasses.iterator();baseClassIter.hasNext();){
    stringBuffer.append(baseClassIter.next());
    stringBuffer.append(TEXT_11);
    if (baseClassIter.hasNext()){
    stringBuffer.append(TEXT_12);
    }}
    stringBuffer.append(TEXT_13);
    stringBuffer.append(theInterface.getName());
    stringBuffer.append(TEXT_14);
    for(Iterator opIter=theInterface.getOperations().iterator();opIter.hasNext();){Operation op=(Operation) opIter.next();
    stringBuffer.append(TEXT_15);
    ReturnType returnType=op.getReturnType();if (returnType != null){
    stringBuffer.append(Helper.getTypeString(returnType));
    }else{
    stringBuffer.append(TEXT_16);
    }
    stringBuffer.append(TEXT_17);
    stringBuffer.append(op.getName());
    stringBuffer.append(TEXT_18);
    for(Iterator paramIter=op.getParameters().iterator();paramIter.hasNext();){Parameter param=(Parameter) paramIter.next();
    stringBuffer.append(Helper.getParameterString(param));
    if (paramIter.hasNext()){
    stringBuffer.append(TEXT_19);
    }
    }
    stringBuffer.append(TEXT_20);
    if (op.isConst()){
    stringBuffer.append(TEXT_21);
    }
    stringBuffer.append(TEXT_22);
    if (returnType != null){
    stringBuffer.append(TEXT_23);
    }
    stringBuffer.append(TEXT_24);
    stringBuffer.append(op.getName());
    stringBuffer.append(TEXT_25);
    for(Iterator paramIter=op.getParameters().iterator();paramIter.hasNext();){Parameter param=(Parameter) paramIter.next();
    stringBuffer.append(TEXT_26);
    stringBuffer.append(param.getName());
    }
    stringBuffer.append(TEXT_27);
    }
    stringBuffer.append(TEXT_28);
    stringBuffer.append(theInterface.getName());
    stringBuffer.append(TEXT_29);
    for(Iterator opIter=theInterface.getOperations().iterator();opIter.hasNext();){Operation op=(Operation) opIter.next();
    stringBuffer.append(TEXT_30);
    ReturnType returnType=op.getReturnType();if (returnType != null){
    stringBuffer.append(Helper.getTypeString(returnType));
    }else{
    stringBuffer.append(TEXT_31);
    }
    stringBuffer.append(TEXT_32);
    stringBuffer.append(op.getName());
    stringBuffer.append(TEXT_33);
    for(Iterator paramIter=op.getParameters().iterator();paramIter.hasNext();){Parameter param=(Parameter) paramIter.next();
    stringBuffer.append(TEXT_34);
    stringBuffer.append(Helper.getParameterString(param));
    }
    stringBuffer.append(TEXT_35);
    }
    stringBuffer.append(TEXT_36);
    stringBuffer.append(theInterface.getName());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(theInterface.getName());
    stringBuffer.append(TEXT_38);
    stringBuffer.append(theInterface.getName());
    stringBuffer.append(TEXT_39);
    stringBuffer.append(theInterface.getName());
    stringBuffer.append(TEXT_40);
    stringBuffer.append(theInterface.getName());
    stringBuffer.append(TEXT_41);
    for(Iterator opIter=theInterface.getOperations().iterator();opIter.hasNext();){Operation op=(Operation) opIter.next();
    stringBuffer.append(TEXT_42);
    stringBuffer.append(theInterface.getName());
    stringBuffer.append(TEXT_43);
    stringBuffer.append(theInterface.getName());
    stringBuffer.append(TEXT_44);
    stringBuffer.append(op.getName());
    if (opIter.hasNext()){
    stringBuffer.append(TEXT_45);
    }
    }
    stringBuffer.append(TEXT_46);
    stringBuffer.append(TEXT_47);
    stringBuffer.append(theInterface.getName());
    stringBuffer.append(TEXT_48);
    for (int i=namespace.size() - 1;i >= 0;i--){
    stringBuffer.append(NL);
    for (int j=0;j < i;j++){
    stringBuffer.append(TEXT_49);
    }
    stringBuffer.append(TEXT_50);
    stringBuffer.append(namespace.get(i));
    }
    stringBuffer.append(TEXT_51);
    return stringBuffer.toString();
  }
}
