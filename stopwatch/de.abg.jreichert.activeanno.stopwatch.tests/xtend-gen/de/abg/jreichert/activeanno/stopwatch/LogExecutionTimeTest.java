package de.abg.jreichert.activeanno.stopwatch;

import de.abg.jreichert.activeanno.stopwatch.LogExecutionTime;
import org.eclipse.xtend.core.compiler.batch.XtendCompilerTester;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;

@SuppressWarnings("all")
public class LogExecutionTimeTest {
  @Extension
  private XtendCompilerTester compilerTester = XtendCompilerTester.newXtendCompilerTester(LogExecutionTime.class);
  
  @Test
  public void testAnnotationAtSimpleMethod() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class MyClass {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* MyDoc");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@de.abg.jreichert.activeanno.stopwatch.LogExecutionTime");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def void simple() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("println(\"simple\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("import de.abg.jreichert.activeanno.stopwatch.LogExecutionTime;");
    _builder_1.newLine();
    _builder_1.append("import java.text.SimpleDateFormat;");
    _builder_1.newLine();
    _builder_1.append("import java.util.Calendar;");
    _builder_1.newLine();
    _builder_1.append("import org.eclipse.xtext.xbase.lib.InputOutput;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("@SuppressWarnings(\"all\")");
    _builder_1.newLine();
    _builder_1.append("public class MyClass {");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("/**");
    _builder_1.newLine();
    _builder_1.append("   ");
    _builder_1.append("* MyDoc");
    _builder_1.newLine();
    _builder_1.append("   ");
    _builder_1.append("*/");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("@LogExecutionTime");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public void simple() {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("long start = System.currentTimeMillis();");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("simple__Measured();");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("logDuration(start, \"simple()\");");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("private void simple__Measured() {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("InputOutput.<String>println(\"simple\");");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("private static void logDuration(final long start, final String message) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("long end = System.currentTimeMillis();");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("SimpleDateFormat df = new SimpleDateFormat(\"mm:ss.SSS\");");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("Calendar cal = Calendar.getInstance();");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("cal.setTimeInMillis(end - start);");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("String timeStr = df.format(cal.getTime());");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("System.err.println(message + \": \" + timeStr + \" min\");");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.compilerTester.assertCompilesTo(_builder, _builder_1);
  }
  
  @Test
  public void testAnnotationAtMethodWithParameters() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class MyClass {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@de.abg.jreichert.activeanno.stopwatch.LogExecutionTime");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def void simple(String text) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("println(text);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("import de.abg.jreichert.activeanno.stopwatch.LogExecutionTime;");
    _builder_1.newLine();
    _builder_1.append("import java.text.SimpleDateFormat;");
    _builder_1.newLine();
    _builder_1.append("import java.util.Calendar;");
    _builder_1.newLine();
    _builder_1.append("import org.eclipse.xtext.xbase.lib.InputOutput;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("@SuppressWarnings(\"all\")");
    _builder_1.newLine();
    _builder_1.append("public class MyClass {");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("@LogExecutionTime");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public void simple(final String text) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("long start = System.currentTimeMillis();");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("simple__Measured(text);");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("logDuration(start, \"simple(text = \" + text + \")\");");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("private void simple__Measured(final String text) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("InputOutput.<String>println(text);");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("private static void logDuration(final long start, final String message) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("long end = System.currentTimeMillis();");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("SimpleDateFormat df = new SimpleDateFormat(\"mm:ss.SSS\");");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("Calendar cal = Calendar.getInstance();");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("cal.setTimeInMillis(end - start);");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("String timeStr = df.format(cal.getTime());");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("System.err.println(message + \": \" + timeStr + \" min\");");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.compilerTester.assertCompilesTo(_builder, _builder_1);
  }
  
  @Test
  public void testAnnotationAtMethodWithReturnType() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class MyClass {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@de.abg.jreichert.activeanno.stopwatch.LogExecutionTime");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def String simple(String text) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("println(text);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return text;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("import de.abg.jreichert.activeanno.stopwatch.LogExecutionTime;");
    _builder_1.newLine();
    _builder_1.append("import java.text.SimpleDateFormat;");
    _builder_1.newLine();
    _builder_1.append("import java.util.Calendar;");
    _builder_1.newLine();
    _builder_1.append("import org.eclipse.xtext.xbase.lib.InputOutput;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("@SuppressWarnings(\"all\")");
    _builder_1.newLine();
    _builder_1.append("public class MyClass {");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("@LogExecutionTime");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public String simple(final String text) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("long start = System.currentTimeMillis();");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("String result = simple__Measured(text);");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("logDuration(start, \"simple(text = \" + text + \")\");");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("return result;");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("private String simple__Measured(final String text) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("InputOutput.<String>println(text);");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("return text;");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("private static void logDuration(final long start, final String message) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("long end = System.currentTimeMillis();");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("SimpleDateFormat df = new SimpleDateFormat(\"mm:ss.SSS\");");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("Calendar cal = Calendar.getInstance();");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("cal.setTimeInMillis(end - start);");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("String timeStr = df.format(cal.getTime());");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("System.err.println(message + \": \" + timeStr + \" min\");");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.compilerTester.assertCompilesTo(_builder, _builder_1);
  }
  
  @Test
  public void testAnnotationAtMethodWithAnnotation() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class MyClass {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@de.abg.jreichert.activeanno.stopwatch.LogExecutionTime");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@javax.annotation.Resource");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def String simple(String text) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("println(text);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return text;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("import de.abg.jreichert.activeanno.stopwatch.LogExecutionTime;");
    _builder_1.newLine();
    _builder_1.append("import java.text.SimpleDateFormat;");
    _builder_1.newLine();
    _builder_1.append("import java.util.Calendar;");
    _builder_1.newLine();
    _builder_1.append("import javax.annotation.Resource;");
    _builder_1.newLine();
    _builder_1.append("import org.eclipse.xtext.xbase.lib.InputOutput;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("@SuppressWarnings(\"all\")");
    _builder_1.newLine();
    _builder_1.append("public class MyClass {");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("@LogExecutionTime");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("@Resource");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public String simple(final String text) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("long start = System.currentTimeMillis();");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("String result = simple__Measured(text);");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("logDuration(start, \"simple(text = \" + text + \")\");");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("return result;");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("private String simple__Measured(final String text) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("InputOutput.<String>println(text);");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("return text;");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("private static void logDuration(final long start, final String message) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("long end = System.currentTimeMillis();");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("SimpleDateFormat df = new SimpleDateFormat(\"mm:ss.SSS\");");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("Calendar cal = Calendar.getInstance();");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("cal.setTimeInMillis(end - start);");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("String timeStr = df.format(cal.getTime());");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("System.err.println(message + \": \" + timeStr + \" min\");");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.compilerTester.assertCompilesTo(_builder, _builder_1);
  }
  
  @Test
  public void testMultipleAnnotations() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class MyClass {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@de.abg.jreichert.activeanno.stopwatch.LogExecutionTime");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def void method1(String text) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("println(text);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@de.abg.jreichert.activeanno.stopwatch.LogExecutionTime");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def void method2(String text) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("println(text);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("import de.abg.jreichert.activeanno.stopwatch.LogExecutionTime;");
    _builder_1.newLine();
    _builder_1.append("import java.text.SimpleDateFormat;");
    _builder_1.newLine();
    _builder_1.append("import java.util.Calendar;");
    _builder_1.newLine();
    _builder_1.append("import org.eclipse.xtext.xbase.lib.InputOutput;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("@SuppressWarnings(\"all\")");
    _builder_1.newLine();
    _builder_1.append("public class MyClass {");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("@LogExecutionTime");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public void method1(final String text) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("long start = System.currentTimeMillis();");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("method1__Measured(text);");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("logDuration(start, \"method1(text = \" + text + \")\");");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("@LogExecutionTime");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public void method2(final String text) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("long start = System.currentTimeMillis();");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("method2__Measured(text);");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("logDuration(start, \"method2(text = \" + text + \")\");");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("private void method1__Measured(final String text) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("InputOutput.<String>println(text);");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("private static void logDuration(final long start, final String message) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("long end = System.currentTimeMillis();");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("SimpleDateFormat df = new SimpleDateFormat(\"mm:ss.SSS\");");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("Calendar cal = Calendar.getInstance();");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("cal.setTimeInMillis(end - start);");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("String timeStr = df.format(cal.getTime());");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("System.err.println(message + \": \" + timeStr + \" min\");");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("private void method2__Measured(final String text) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("InputOutput.<String>println(text);");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.compilerTester.assertCompilesTo(_builder, _builder_1);
  }
}