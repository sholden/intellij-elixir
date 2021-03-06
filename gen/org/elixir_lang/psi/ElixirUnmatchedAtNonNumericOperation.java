// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi;

import com.ericsson.otp.erlang.OtpErlangObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ElixirUnmatchedAtNonNumericOperation extends ElixirUnmatchedExpression, PrefixOperation {

  @NotNull
  ElixirAtPrefixOperator getAtPrefixOperator();

  @Nullable
  ElixirUnmatchedExpression getUnmatchedExpression();

  @NotNull
  OtpErlangObject quote();

}
