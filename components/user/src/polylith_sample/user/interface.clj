(ns polylith-sample.user.interface
  (:require
    [polylith-sample.user.core :as core]))

(defn hello [name]
  (core/hello name))
