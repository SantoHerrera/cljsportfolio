(ns hello-world-react.prod
  (:require
    [hello-world-react.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
