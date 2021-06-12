(ns polylith-sample.cli.core
  (:require
   [polylith-sample.user.interface :as user])
  (:gen-class))

(defn -main [& args]
  (println (user/hello (first args)))
  (System/exit 0))
