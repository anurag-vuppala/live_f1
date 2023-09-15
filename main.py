import fastf1
session = fastf1.get_session(2020, 'Monza', 'Q')
session.load(telemetry=True, laps=True, weather=True)
print("start")
vettel = session.get_driver('HAM')
print(f"Pronto {vettel}?")