from telemetry_f1_2021.listener import TelemetryListener

listener = TelemetryListener(port=20777, host='localhost')
packet = listener.get()