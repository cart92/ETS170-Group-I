val m1 = Model(
	Quality("Navigation") has (
		Gist("Time [seconds] to position user."),
		Spec("The time it takes for the product to position the user with GPS"),
		Breakpoint("utility") has Value(15),
		Breakpoint("differentiation") has Value(2),
		Breakpoint("saturation") has Value(1),
		Target("basic") has (
			Value(5), Comment("Probably possible with simple integration of Google API")),
		Target("strech") has (
			Value(3), Comment("Probably need to have better data than Google.")),
		Barrier("first") has Value(4),
		Barrier("second") has Value(3),
		Product("competitorA") has Value(3),
		Product("competitorB") has Value(5)
	), Test("startup") verifies Quality("Navigaton"), Test("startup") has (
		Spec("Calculate average time in seconds from startup til user-position is determined."),
		Target("stretch")
	)
)

val m2 = Model(
	Quality("Parking") has (
		Gist("Distance [meters] from pinpoint to car"),
		Spec("The distance from the believed parking of the users car, to the actual car."),
		Breakpoint("utility") has Value(20),
		Breakpoint("differentiation") has Value(5),
		Breakpoint("saturation") has Value(2),
		Target("basic") has (
			Value(6), Comment("Probably possible with simple integration of Google API")),
		Target("strech") has (
			Value(3), Comment("Probably need to have better data than Google.")),
		Barrier("first") has Value(5),
		Barrier("second") has Value(3),
		Product("competitorA") has Value(4),
		Product("competitorB") has Value(10)
	), Test("pinpoint") verifies Quality("Parking"), Test("pinpoint") has (
		Spec("Calculate average difference in meters between believed to actual car. "),
		Target("stretch")
	)
)

val m3 = Model(
	Quality("PublicTransportation") has (
		Gist("Time [minutes] of quickest estimation of travel time."),
		Spec("The estimated number of minutes to the mall from current position of the user."),
		Breakpoint("utility") has Value(55),
		Breakpoint("differentiation") has Value(45),
		Breakpoint("saturation") has Value(38),
		Target("basic") has (
			Value(47), Comment("Probably possible with simple integration of Google API")),
		Target("strech") has (
			Value(44), Comment("Probably need to have better data than Google.")),
		Barrier("first") has Value(49),
		Barrier("second") has Value(45),
		Product("competitorA") has Value(49),
		Product("competitorB") has Value(42)
	), Test("startup") verifies Quality("PublicTransportation"), Test("startup") has (
		Spec("Calculate average time in minutes to the mall from current position of the user."),
		Target("stretch")
	)
)

val mAll = Model(
	Quality("Navigation") has (
		Gist("Time [seconds] to position user."),
		Spec("The time it takes for the product to position the user with GPS"),
		Breakpoint("utility") has Value(15),
		Breakpoint("differentiation") has Value(2),
		Breakpoint("saturation") has Value(1),
		Target("basic") has (
			Value(5), Comment("Probably possible with simple integration of Google API")),
		Target("strech") has (
			Value(3), Comment("Probably need to have better data than Google.")),
		Barrier("first") has Value(4),
		Barrier("second") has Value(3),
		Product("competitorA") has Value(3),
		Product("competitorB") has Value(5),
		Image("navigation.png")
	), Quality("Parking") has (
		Gist("Distance [meters] from pinpoint to car"),
		Spec("The distance from the believed parking of the users car, to the actual car."),
		Breakpoint("utility") has Value(20),
		Breakpoint("differentiation") has Value(5),
		Breakpoint("saturation") has Value(2),
		Target("basic") has (
			Value(6), Comment("Probably possible with simple integration of Google API")),
		Target("strech") has (
			Value(3), Comment("Probably need to have better data than Google.")),
		Barrier("first") has Value(5),
		Barrier("second") has Value(3),
		Product("competitorA") has Value(4),
		Product("competitorB") has Value(10),
		Image("parking.png")
	), Quality("PublicTransportation") has (
		Gist("Time [minutes] of quickest estimation of travel time."),
		Spec("The estimated number of minutes to the mall from current position of the user."),
		Breakpoint("utility") has Value(55),
		Breakpoint("differentiation") has Value(45),
		Breakpoint("saturation") has Value(38),
		Target("basic") has (
			Value(47), Comment("Probably possible with simple integration of Google API")),
		Target("strech") has (
			Value(44), Comment("Probably need to have better data than Google.")),
		Barrier("first") has Value(49),
		Barrier("second") has Value(45),
		Product("competitorA") has Value(49),
		Product("competitorB") has Value(42),
		Image("publicTransport.png")
	)
)
