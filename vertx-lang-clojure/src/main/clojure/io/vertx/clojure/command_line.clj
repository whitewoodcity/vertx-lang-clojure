(ns io.vertx.clojure.command-line)

(import io.vertx.core.cli.CommandLine)
(import io.vertx.core.cli.Option)
(import io.vertx.core.cli.CLI)
(import io.vertx.core.cli.Argument)

(defn get-raw-values-for-argument
  ([command-line argument] (.getRawValuesForArgument command-line argument)))
(defn cli
  ([command-line ] (.cli command-line )))
(defn get-argument-value
  ([command-line name] (.getArgumentValue command-line name))
  ([command-line index] (.getArgumentValue command-line index)))
(defn accept-more-values
  ([command-line option] (.acceptMoreValues command-line option)))
(defn is-valid
  ([command-line ] (.isValid command-line )))
(defn get-raw-value-for-argument
  ([command-line arg] (.getRawValueForArgument command-line arg)))
(defn is-argument-assigned
  ([command-line arg] (.isArgumentAssigned command-line arg)))
(defn is-option-assigned
  ([command-line option] (.isOptionAssigned command-line option)))
(defn all-arguments
  ([command-line ] (.allArguments command-line )))
(defn get-raw-values-for-option
  ([command-line option] (.getRawValuesForOption command-line option)))
(defn is-seen-in-command-line
  ([command-line option] (.isSeenInCommandLine command-line option)))
(defn is-flag-enabled
  ([command-line name] (.isFlagEnabled command-line name)))
(defn get-option-value
  ([command-line name] (.getOptionValue command-line name)))
(defn is-asking-for-help
  ([command-line ] (.isAskingForHelp command-line )))
(defn create
  ([cli] (CommandLine/create cli)))
(defn get-raw-values
  ([command-line option] (.getRawValues command-line option)))
(defn get-raw-value-for-option
  ([command-line option] (.getRawValueForOption command-line option)))