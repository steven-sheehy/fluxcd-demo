# FluxCD Demo

## Setup

```console
brew install fluxctl
helm repo add fluxcd https://charts.fluxcd.io
kubectl create namespace flux
kubectl apply -f https://raw.githubusercontent.com/fluxcd/helm-operator/v1.0.1/chart/helm-operator/crds/helmrelease.yaml
helm upgrade -i --wait -n flux -f flux.yaml flux fluxcd/flux
helm upgrade -i --wait -n flux -f flux-helm.yaml flux-helm fluxcd/helm-operator
```

