// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi;

import com.ericsson.otp.erlang.OtpErlangObject;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface ElixirMatchedPipeOperation extends ElixirMatchedExpression, InfixOperation {

  @NotNull
  List<ElixirMatchedExpression> getMatchedExpressionList();

  @NotNull
  ElixirPipeInfixOperator getPipeInfixOperator();

  @NotNull
  Quotable leftOperand();

  @NotNull
  Operator operator();

  @NotNull
  OtpErlangObject quote();

  @NotNull
  Quotable rightOperand();

}
